import React from "react";

class Tabela extends React.Component {
  render() {
    return (
      <div id="minhaTabela">
        <h1>{this.props.title}</h1>
        <h6>{this.props.description}</h6>
        <table>
          <tr>
            {this.props.columns.map((column) => (
              <th>{column}</th>
            ))}
          </tr>
          {this.props.data.map((row) => (
            <tr>
              <td>{row.event}</td>
              <td>{row.deviceId}</td>
              <td>{row.comment}</td>
            </tr>
          ))}
        </table>
      </div>
    );
  }
}

export default Tabela;
