import { Component } from "react";
import Tabela from "../../components/Tabela";
import "./index.css";

class TabelaFrame extends Component {
  render() {
    return (
      <Tabela
        title="Minha Tabela"
        description="Semana 08 Exercício 09"
        columns={["Event", "Device Id", "Comment"]}
        data={[
          {
            event: "valor do evento",
            deviceId: "valor do deviceId",
            comment: "valor do comment",
          },
          {
            event: "valor do evento",
            deviceId: "valor do deviceId",
            comment: "valor do comment",
          },
          {
            event: "valor do evento",
            deviceId: "valor do deviceId",
            comment: "valor do comment",
          },
        ]}
      />
    );
  }
}

export default TabelaFrame;
