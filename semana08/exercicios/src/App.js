import img from "./images/snakes_escher.jpg";
import avatar from "./images/Matsya-Avatar.png";
import "./App.css";
import Button from "./components/Button/button";
import Contato from "./components/Contato/contato";

function App() {
  return (
    <div className="App">
      <Button title={"GetStarted"} bgcolor={"blue"}></Button>
      <ul>
        <Contato
          img={img}
          name={"Lucas F. Lotaif"}
          about={"Almost a full stack developer"}
        />
        <Contato
          img={avatar}
          name={"Another Contact"}
          about={"about this contact"}
        />
        <Contato
          img={avatar}
          name={"Another Contact"}
          about={"about this contact"}
        />
        <Contato
          img={avatar}
          name={"Another Contact"}
          about={"about this contact"}
        />
      </ul>
    </div>
  );
}

export default App;
