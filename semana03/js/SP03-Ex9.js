let listaStore = [];
let input = document.getElementById('adicionar');

input.addEventListener('keyup', function(event) {
    if (event.key === 'Enter') {
        event.preventDefault();
        document.getElementById('addButton').click();
    }
})



function adicionarItem (item) {
    
    if (!item) {
        alert('Você deve inserir um item');
        return;
    }

    let lista = document.createElement('li');
    let texto = document.createTextNode(item);

    lista.appendChild(texto);

    document.getElementById('lista').appendChild(lista);

    listaStore.push(item);
        
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
    console.log(lista);
    if (!lista || lista.length == 0) {
        alert('Não há itens salvos');
        return;
    }

    document.getElementById('lista').innerHTML = '';
    listaStore = [];
    
    for (let item of lista) {
        adicionarItem(item);
    }

}

function limparLista() {
    document.getElementById('lista').innerHTML = '';
    listaStore = [];
}

console.log(JSON.stringify(listaStore));