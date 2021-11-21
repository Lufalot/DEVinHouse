import { BrowserRouter, Routes, Route } from "react-router-dom";
import Footer from "./components/Footer";
import FormEmpresa from "./pages/Form/Empresa";
import FormProduto from "./pages/Form/Produto";
import Login from "./pages/Login";
import MapView from "./pages/MapView";

const Router = () => {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/form/empresa" element={<FormEmpresa />} />
          <Route path="/form/produto" element={<FormProduto />} />
          <Route path="/map" element={<MapView />} />
          <Route path="/" element={<Login />} />
        </Routes>
      </BrowserRouter>
      <Footer />
    </>
  );
};

export default Router;
