const button = document.querySelector('input');

class Piada {
    constructor(dataCriacao, urlIcone, id, url, piada, categoria) {
        this.dataCriacao = dataCriacao,
        this.urlIcone = urlIcone,
        this.id = id,
        this.url = url,
        this.piada = piada,
        this.categoria = categoria.toString();
    }

    criarElemento() {
        let div = document.createElement('div');
        let img = document.createElement('img');
        let span = document.createElement('span');
        
        img.src = this.urlIcone;
        span.textContent = `${this.piada} ${this.dataCriacao}`;

        div.appendChild(img);
        div.appendChild(span);
        document.body.appendChild(div);
    }
}

async function joke() {
        let apiUrl = 'https://api.chucknorris.io/jokes/random'

        const select = document.getElementById('categorias').value;
        if (select !== 'nenhuma') {
            apiUrl += `?category=${select}`;
        }
        
        let response = await fetch(apiUrl);
        let data = await response.json();
        let { created_at, icon_url, id, url, value, categories } = data;
        let jokeData = new Piada(created_at, icon_url, id, url, value, categories);
        console.log(jokeData);            
        jokeData.criarElemento();
};

async function carregarCategorias() {
    const response = await fetch('https://api.chucknorris.io/jokes/categories');
    const categorias = await response.json();
    let select = document.getElementById('categorias');

    for (let categoria of categorias) {
        let option = document.createElement('option');
        option.value = categoria;
        option.text = categoria;
        select.appendChild(option);
    };

    return categorias;
};
 
const categorias = carregarCategorias();

button.addEventListener('click', joke);
