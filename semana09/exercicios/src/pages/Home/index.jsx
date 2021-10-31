import React from "react";
import Receita from "../../components/Receita";
import RECEITAS from "../../assets/receitas";
import Header from "../../components/Header";

class Home extends React.Component {
  render() {
    return (
      <>
        <Header />
        <main class="receitaLista">
          {RECEITAS.map((receita) => (
            <Receita
              image={receita.image}
              name={receita.name}
              description={receita.description}
            />
          ))}
        </main>
      </>
    );
  }
}

export default Home;
