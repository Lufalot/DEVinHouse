import { useState } from "react";
import { useNavigate } from "react-router-dom";

import "./styles.css";

const Login = (props) => {
  const [login, setLogin] = useState("");
  const [password, setPassword] = useState("");

  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!login) {
      alert("Login obrigatório.");
      return;
    } else if (!password || password.length !== 8) {
      alert("A senha deve conter 8 dígitos.");
      return;
    }

    async function authenticate() {
      try {
        const response = await fetch("http://localhost:3333/user");
        const user = await response.json();
        console.log(user);

        if (user.login !== login || user.password !== password) {
          alert("Login ou senha incorretos.");
          return;
        }

        navigate("/map");
      } catch (error) {
        alert("Houve um erro ao validar os dados, tente novamente.");
      }
    }
    authenticate();
  };

  return (
    <div className="form-login-container">
      <form className="form-login" onSubmit={handleSubmit}>
        <label htmlFor="login">Login:</label>
        <input
          type="email"
          name="login"
          placeholder="nome@empresa.com"
          value={login}
          onChange={(e) => setLogin(e.target.value)}
          required
          title="Insira seu e-mail"
          className="input-login"
        />

        <label htmlFor="password">Senha:</label>
        <input
          type="password"
          name="password"
          placeholder="senha"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
          pattern="[A-Za-z0-9]{8}"
          title="Insira uma senha com 8 dígitos"
        />
        <button className="form-button" type="submit">
          Entrar
        </button>
      </form>
    </div>
  );
};

export default Login;
