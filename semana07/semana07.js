const button = document.querySelector('input');

class Piada {
    constructor(dataCriacao, urlIcone, id, url, piada) {
        this.dataCriacao = dataCriacao,
        this.urlIcone = urlIcone,
        this.id = id,
        this.url = url,
        this.piada = piada
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
        let response = await fetch('https://api.chucknorris.io/jokes/random');
        let data = await response.json();
        let { created_at, icon_url, id, url, value } = data;
        let jokeData = new Piada(created_at, icon_url, id, url, value);
        console.log(jokeData);            
        jokeData.criarElemento();
};
            


button.addEventListener('click', joke);

