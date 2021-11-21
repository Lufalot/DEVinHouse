import { useState } from "react";
import { Form, Button, Container, Row, Col } from "react-bootstrap";
import { useNavigate } from "react-router";
import Header from "../../../components/Header";

import "./styles.css";

const FormEmpresa = () => {
  const navigate = useNavigate();

  const [razao, setRazao] = useState("");
  const [nome, setNome] = useState("");
  const [cnpj, setCnpj] = useState("");
  const [email, setEmail] = useState("");
  const [cep, setCep] = useState("");
  const [endereco, setEndereco] = useState("");
  const [numero, setNumero] = useState("");
  const [bairro, setBairro] = useState("");
  const [cidade, setCidade] = useState("");
  const [complemento, setComplemento] = useState("");
  const [latitude, setLatitude] = useState("");
  const [longitude, setLongitude] = useState("");

  const handleSubmit = async (e) => {
    try {
      e.preventDefault();
      console.log(razao ? true : false);
      if (
        !razao ||
        !nome ||
        !cnpj ||
        !email ||
        !cep ||
        !endereco ||
        !numero ||
        !bairro ||
        !cidade ||
        !latitude ||
        !longitude
      ) {
        alert("Todos os campos (menos Complemento) são obrigatórios");
        return;
      }

      await fetch("http://localhost:3333/empresas", {
        headers: {
          Accept: "application/json",
          "Content-Type": "application/json",
        },
        method: "POST",
        body: JSON.stringify({
          razao: razao,
          nome: nome,
          cnpj: cnpj,
          email: email,
          cep: cep,
          endereco: endereco,
          numero: numero,
          bairro: bairro,
          cidade: cidade,
          complemento: complemento,
          latitude: latitude,
          longitude: longitude,
        }),
      });
      alert("Empresa cadastrada com sucesso");
      navigate("/map");
    } catch (error) {
      alert(error);
    }
  };

  const getGeolocation = async (e) => {
    try {
      if (cidade && endereco) {
        const parameters =
          cidade.replace(/ /g, "+") + "+" + endereco.replace(/ /g, "+");
        let data = await fetch(
          `https://nominatim.openstreetmap.org/search?q=${parameters}+${numero}&format=json&polygon=1&addressdetails=0`
        );
        let geo = await data.json();

        //Se não tiver resultado consulta sem o número
        if (geo.length === 0) {
          data = await fetch(
            `https://nominatim.openstreetmap.org/search?q=${parameters}&format=json&polygon=1&addressdetails=0`
          );
          geo = await data.json();
        }

        if (geo.length === 0) {
          alert(
            "Não foi possível encontrar a geolocalização. Por favor, corrija o endereço ou preencha manualmente."
          );
          return;
        }
        console.log(geo);
        setLatitude(geo[0].lat);
        setLongitude(geo[0].lon);
      } else {
        alert("Para buscar a geolocalização preencha o endereço.");
      }
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <>
      <Header />
      <Container className="empresa-container">
        <Form onSubmit={handleSubmit}>
          <div className="form-header">
            <h2>Nova empresa</h2>
            <Button variant="primary" type="submit">
              Submit
            </Button>
          </div>

          <Row className="mb-3">
            <Form.Group as={Col} controlId="formGridRazao">
              <Form.Label>Razão social</Form.Label>
              <Form.Control
                type="text"
                value={razao}
                onChange={(e) => setRazao(e.target.value)}
                required
              />
            </Form.Group>

            <Form.Group as={Col} controlId="formGridName">
              <Form.Label>Nome fantasia</Form.Label>
              <Form.Control
                type="text"
                value={nome}
                onChange={(e) => setNome(e.target.value)}
                required
              />
            </Form.Group>
          </Row>

          <Row className="mb-3">
            <Form.Group as={Col} controlId="formGridCnpj">
              <Form.Label>CNPJ</Form.Label>
              <Form.Control
                type="text"
                value={cnpj}
                onChange={(e) => setCnpj(e.target.value)}
                required
              />
            </Form.Group>

            <Form.Group as={Col} controlId="formGridEmail">
              <Form.Label>Email</Form.Label>
              <Form.Control
                type="email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
                required
              />
            </Form.Group>
          </Row>

          <hr />

          <Row className="mb-3">
            <Form.Group as={Col} controlId="formGridZip">
              <Form.Label>CEP</Form.Label>
              <Form.Control
                value={cep}
                onChange={(e) => setCep(e.target.value)}
                required
              />
            </Form.Group>

            <Form.Group as={Col} controlId="formGridAddress">
              <Form.Label>Endereço</Form.Label>
              <Form.Control
                value={endereco}
                onChange={(e) => setEndereco(e.target.value)}
                required
              />
            </Form.Group>
          </Row>

          <Row className="mb-3">
            <Form.Group as={Col} controlId="formGridNumber">
              <Form.Label>Número</Form.Label>
              <Form.Control
                type="number"
                value={numero}
                onChange={(e) => setNumero(e.target.value)}
                required
              />
            </Form.Group>

            <Form.Group as={Col} controlId="formGridBairro">
              <Form.Label>Bairro</Form.Label>
              <Form.Control
                value={bairro}
                onChange={(e) => setBairro(e.target.value)}
                required
              />
            </Form.Group>

            <Form.Group as={Col} controlId="formGridCity">
              <Form.Label>Cidade</Form.Label>
              <Form.Control
                value={cidade}
                onChange={(e) => setCidade(e.target.value)}
                required
              />
            </Form.Group>
          </Row>

          <Form.Group controlId="formGridComplemento">
            <Form.Label>Complemento</Form.Label>
            <Form.Control
              value={complemento}
              onChange={(e) => setComplemento(e.target.value)}
            />
          </Form.Group>

          <hr />
          <Button className="mb-3" variant="secondary" onClick={getGeolocation}>
            Preencher Geolocalização
          </Button>

          <Row className="mb-3">
            <Form.Group as={Col} controlId="formGridLatitude">
              <Form.Label>Latitude</Form.Label>
              <Form.Control
                type="text"
                value={latitude}
                onChange={(e) => setLatitude(e.target.value)}
                required
              />
            </Form.Group>

            <Form.Group as={Col} controlId="formGridLongitude">
              <Form.Label>Longitude</Form.Label>
              <Form.Control
                type="text"
                value={longitude}
                onChange={(e) => setLongitude(e.target.value)}
                required
              />
            </Form.Group>
          </Row>
        </Form>
      </Container>
    </>
  );
};

export default FormEmpresa;
