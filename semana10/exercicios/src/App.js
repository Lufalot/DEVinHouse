import "./App.css";
import Header from "./components/Header";
import Home from "./pages/Home";
import Receita from "./pages/Receita";
import { BrowserRouter, Switch, Route } from "react-router-dom";
import Footer from "./components/Footer";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Header />
        <Switch>
          <Route path="/receita" component={Receita} />
          <Route path="/" component={Home} />
        </Switch>
        <Footer />
      </BrowserRouter>
    </div>
  );
}

export default App;
