import React from "react";
import "./styles.css";

class ReceitaInfo extends React.Component {
  render() {
    return (
      <section className="receita-info">
        <img width="300px" src={this.props.image} alt={this.props.name} />
        <h2>{this.props.name}</h2>
        <h4>Autor: {this.props.author}</h4>
        <h5>{this.props.description}</h5>
        <p>{this.props.text}</p>
      </section>
    );
  }
}

export default ReceitaInfo;
