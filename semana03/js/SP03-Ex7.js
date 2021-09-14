function adicionarItem (item) {
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
}