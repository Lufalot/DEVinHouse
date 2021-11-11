import React from "react";
import ReceitaItem from "./ReceitaItem";
import RECEITAS from "../../assets/receitas";
import Search from "../Search";
import "./styles.css";

class ReceitaLista extends React.Component {
  constructor(props) {
    super(props);
    this.state = { receitasFiltradas: RECEITAS };
    this.receitas = RECEITAS;
  }

  handleSearch = (e) => {
    const text = e.target.value;
    const resultFilter = this.receitas.filter((receita) => {
      return (
        receita.name.toLowerCase().includes(text.toLowerCase()) ||
        receita.description.toLowerCase().includes(text.toLowerCase())
      );
    });

    this.setState({ receitasFiltradas: resultFilter });
  };

  render() {
    return (
      <>
        <Search onChange={this.handleSearch} />
        <main className="receitaLista">
          {this.state.receitasFiltradas.map((receita) => (
            <ReceitaItem key={receita.id} {...receita} />
          ))}
        </main>
      </>
    );
  }
}

export default ReceitaLista;
