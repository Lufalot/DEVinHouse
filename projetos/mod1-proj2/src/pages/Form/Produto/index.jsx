import { useEffect, useState } from "react";
import { Form, Button, Container, Row, Col } from "react-bootstrap";
import { useNavigate } from "react-router";
import Header from "../../../components/Header";
import "./styles.css";

const FormProduto = () => {
  const navigate = useNavigate();

  const [imgUrl, setImgUrl] = useState("");
  const [nome, setNome] = useState("");
  const [custo, setCusto] = useState("");
  const [descricao, setDescricao] = useState("");
  const [fornecedor, setFornecedor] = useState("");
  const [fornecedores, setFornecedores] = useState([]);
  const [grupo, setGrupo] = useState("");
  const [categorias, setCategorias] = useState([]);

  const handleSubmit = async (e) => {
    try {
      e.preventDefault();

      if (!imgUrl || !nome || !custo || !descricao || !fornecedor || !grupo) {
        alert("Todos os campos são obrigatórios");
        return;
      }

      await fetch("http://localhost:3333/produtos", {
        headers: {
          Accept: "application/json",
          "Content-Type": "application/json",
        },
        method: "POST",
        body: JSON.stringify({
          imgUrl,
          nome,
          custo,
          descricao,
          fornecedor,
          grupo,
        }),
      });
      alert("Produto cadastrado com sucesso");
      navigate("/map");
    } catch (error) {
      alert(error);
    }
  };

  useEffect(() => {
    async function getFornecedores() {
      try {
        const response = await fetch("http://localhost:3333/fornecedores");
        const data = await response.json();
        setFornecedores(data);
      } catch (error) {
        alert("Houve um erro ao tentar listar os fornecedores.");
      }
    }

    async function getCategorias() {
      try {
        const response = await fetch("http://localhost:3333/categorias");
        const data = await response.json();
        setCategorias(data);
      } catch (error) {
        alert("Houve um erro ao tentar listar as categorias.");
      }
    }

    getFornecedores();
    getCategorias();
  }, []);

  return (
    <>
      <Header />
      <Container>
        <Form className="form-produto-container" onSubmit={handleSubmit}>
          <div className="form-header">
            <h2>Novo produto</h2>
            <Button variant="primary" type="submit">
              Submit
            </Button>
          </div>

          <div className="imagem-produto">
            {imgUrl && <img src={imgUrl} alt="product" width="100px" />}
          </div>

          <Row className="mb-3">
            <Form.Group controlId="formGridUrl">
              <Form.Label>URL da imagem</Form.Label>
              <Form.Control
                type="text"
                value={imgUrl}
                onChange={(e) => setImgUrl(e.target.value)}
                required
              />
            </Form.Group>
          </Row>

          <Row className="mb-3">
            <Form.Group as={Col} controlId="formGridNome">
              <Form.Label>Nome</Form.Label>
              <Form.Control
                type="text"
                value={nome}
                onChange={(e) => setNome(e.target.value)}
                required
              />
            </Form.Group>

            <Form.Group as={Col} controlId="formCusto">
              <Form.Label>Custo unitário</Form.Label>
              <Form.Control
                type="text"
                value={custo}
                onChange={(e) => setCusto(e.target.value)}
                required
              />
            </Form.Group>
          </Row>

          <Form.Group className="mb-3" controlId="formGridDescricao">
            <Form.Label>Descrição</Form.Label>
            <Form.Control
              as="textarea"
              value={descricao}
              onChange={(e) => setDescricao(e.target.value)}
            />
          </Form.Group>

          <hr />

          <Row className="mb-3">
            <Form.Group as={Col} controlId="formGridFornecedor">
              <Form.Label>Fornecedor</Form.Label>
              <Form.Select
                aria-label="Fornecedor"
                onChange={(e) => setFornecedor(e.target.value)}
              >
                <option value="">Escolha o fornecedor</option>
                {fornecedores.map((fornecedor, index) => {
                  return (
                    <option value={fornecedor} key={index}>
                      {fornecedor}
                    </option>
                  );
                })}
              </Form.Select>
            </Form.Group>

            <Form.Group as={Col} controlId="formGridGrupo">
              <Form.Label>Grupo</Form.Label>
              <Form.Select
                aria-label="Categoria"
                onChange={(e) => setGrupo(e.target.value)}
              >
                <option value="">Escolha a categoria do produto</option>
                {categorias.map((categoria, index) => {
                  return (
                    <option value={categoria} key={index}>
                      {categoria}
                    </option>
                  );
                })}
              </Form.Select>
            </Form.Group>
          </Row>

          <hr />
        </Form>
      </Container>
    </>
  );
};

export default FormProduto;
