let listaStore = [];

//Adicionar item com Enter
let input = document.getElementById('adicionar');
input.addEventListener('keyup', function(event) {
    if (event.key === 'Enter') {
        event.preventDefault();
        document.getElementById('addButton').click();
    }
})

function adicionarItem (item) {
    if (!item) {
        alert('Você deve inserir uma tarefa');
        return;
    }

    let contador = listaStore.length;

    let lista = document.createElement('li');
    let checkbox = document.createElement('input');
    let label = document.createElement('label');
    let button = document.createElement('button');

    let texto = document.createTextNode(item);
    label.appendChild(texto);

    //let textoButton = document.createTextNode('&#10006;');
    //button.appendChild(textoButton);
    button.innerHTML = '&#10006;'

    checkbox.type = 'checkbox';
    checkbox.id = `item${contador}`;
    checkbox.name = `item${contador}`;
    checkbox.value = item;
    label.htmlFor = `item${contador}`;
    
    button.setAttribute('onclick','removerItem(this)');

    lista.appendChild(checkbox);    
    lista.appendChild(label);
    lista.appendChild(button);

    document.getElementById('lista').appendChild(lista);

    //Evento para capturar o checked
    checkbox.addEventListener('change', () => {
        let inputId = `item${contador}`;
        let inputChecked = document.getElementById(inputId).checked;                   
        if (inputChecked) {
            listaStore[contador].checked = true;
        } else { listaStore[contador].checked = false }       
    });

    listaStore.push({item,'checked':false});
        
    input.value = '';
}

function salvarLista() {
    
    if (!listaStore || listaStore.length == 0) {
        alert('Não há itens a salvar');
        return;
    }
    localStorage.setItem('lista',JSON.stringify(listaStore));
}

function carregarLista() {
    let lista = JSON.parse(localStorage.getItem('lista'));
    if (!lista || lista.length == 0) {
        alert('Não há itens salvos');
        return;
    }
     
    document.getElementById('lista').innerHTML = '';
    listaStore = [];
    
    for (let cadaItem of lista) {
        if (!cadaItem) {
            continue;
        }
        adicionarItem(cadaItem.item);
        document.getElementById('item'+(listaStore.length-1)).checked = cadaItem.checked;
        listaStore[listaStore.length-1].checked = cadaItem.checked;
    }

}

function limparLista() {
    document.getElementById('lista').innerHTML = '';
    listaStore = [];
}

function deletarLista() {
    if (confirm('Remover lista de tarefas do banco de dados?')) {
    document.getElementById('lista').innerHTML = '';
    listaStore = [];
    localStorage.removeItem('lista');
    }
}

function removerItem(e) {
    if (confirm('Remover tarefa da lista?')) {
        let index = e.parentNode.childNodes[0].id.substr(4,4);
        delete listaStore[index];
        e.parentNode.remove();
    }
}