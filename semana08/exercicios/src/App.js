import ContactList from "./pages/ContactList";
import "./App.css";
import Home from "./pages/Home";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import TabelaFrame from "./pages/TabelaFrame";

function App() {
  return (
    <div className="App">
      <Router>
        <Switch>
          <Route path="/contato">
            <ContactList />
          </Route>
          <Route path="/tabela">
            <TabelaFrame />
          </Route>
          <Route path="/">
            <Home />
          </Route>
        </Switch>
      </Router>
    </div>
  );
}

export default App;
