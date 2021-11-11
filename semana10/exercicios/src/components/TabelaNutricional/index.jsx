import React, { Component } from "react";
import "./styles.css";

export default class TabelaNutricional extends Component {
  render() {
    return (
      <div>
        <table>
          <thead>
            <tr>
              <td colSpan="2" style={{ backgroundColor: "tomato" }}>
                {this.props.name}
              </td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td colSpan="2">{this.props.energia} Kcal</td>
            </tr>
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
