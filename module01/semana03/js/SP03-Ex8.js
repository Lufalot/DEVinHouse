const listaStore = { item: [] };
let input = document.getElementById('adicionar');

input.addEventListener('keyup', function(event) {
    if (event.key === 'Enter') {
        event.preventDefault();
        adicionarItem();
    }
})

function adicionarItem () {
    
    let item = input.value;

    if (!item) {
        alert('Você deve inserir um item');
        return;
    }

    let lista = document.createElement('li');
    let option = document.createElement('option');
    let texto = document.createTextNode(item);
    let textoSelect = document.createTextNode(item);

    lista.appendChild(texto);
    option.appendChild(textoSelect);

    document.getElementById('lista').appendChild(lista);
    document.getElementById('selectLista').appendChild(option);

    listaStore.item.push(item);
        
    input.value = '';
    
}

function salvarLista() {
    localStorage.setItem('lista',JSON.stringify(listaStore));
}

console.log(JSON.stringify(listaStore));