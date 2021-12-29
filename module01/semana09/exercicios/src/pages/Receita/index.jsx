import React from "react";
import TabelaNutricional from "../../components/TabelaNutricional";
import VALORES from "../../assets/tabelaNutricional";
import "./styles.css";
import ReceitaInfo from "../../components/ReceitaLista/ReceitaItem/ReceitaInfo";

class Receita extends React.Component {
  constructor(props) {
    super(props);
    this.data = { ...this.props.location.state };
  }

  render() {
    return (
      <>
        <ReceitaInfo {...this.data} />

        <div className="containerTabela">
          {VALORES.map((item) => {
            return (
              <TabelaNutricional
                key={item.id}
                name={item.name}
                energia={item.energia}
                carboidratos={item.carboidratos}
                proteinas={item.proteinas}
                lipideos={item.lipideos}
              />
            );
          })}
        </div>
      </>
    );
  }
}

export default Receita;
