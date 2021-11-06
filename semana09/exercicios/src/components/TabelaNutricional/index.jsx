import React, { Component } from "react";
import "./index.css";

export default class TabelaNutricional extends Component {
  render() {
    return (
      <div class="tabelaNutricional">
        <table border="1">
          <thead>{this.props.name}</thead>
          <tbody>
            <thead>{this.props.energia} Kcal</thead>
            <tr>
              <td>Carboidratos</td>
              <td>{this.props.carboidratos}</td>
            </tr>
            <tr>
              <td>Proteínas</td>
              <td>{this.props.proteinas}</td>
            </tr>
            <tr>
              <td>Lipídeos</td>
              <td>{this.props.lipideos}</td>
            </tr>
          </tbody>
        </table>
      </div>
    );
  }
}
