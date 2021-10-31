import React from "react";

class Receita extends React.Component {
  render() {
    return (
      <section className="receitasItem">
        <img src={this.props.image} alt={this.props.name} height="200px" />
        <h4>{this.props.name}</h4>
        <span>{this.props.description}</span>
        <input type="button" value="Veja a Receita" />
      </section>
    );
  }
}

export default Receita;
