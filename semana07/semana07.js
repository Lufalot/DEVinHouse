const button = document.querySelector('input');

function joke() {
        fetch('https://api.chucknorris.io/jokes/random')
            .then(response => response.json())
            .then(data => {
                let { created_at, icon_url, id, url, value } = data;
                
            })
            
};

button.addEventListener('click', joke);

class Piada {
    constructor(dataCriacao, urlIcone, id, url, piada) {
        this.dataCriacao = dataCriacao,
        this.urlIcone = urlIcone,
        this.id = id,
        this.url = url,
        this.piada = piada
    }
}
