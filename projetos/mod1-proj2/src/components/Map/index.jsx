import { useEffect, useState } from "react";
import { MapContainer, TileLayer, Marker, Popup } from "react-leaflet";

import "./styles.css";

export const Map = () => {
  const [empresas, setEmpresas] = useState([]);

  useEffect(() => {
    const getEmpresas = async () => {
      try {
        const response = await fetch("http://localhost:3333/empresas");
        const data = await response.json();
        console.log(data);
        setEmpresas(data);
      } catch (error) {
        console.log(error);
      }
    };
    getEmpresas();
  }, []);

  return (
    <MapContainer
      center={[-28.0046481, -49.5148828, 14]}
      zoom={12}
      scrollWheelZoom={true}
    >
      <TileLayer
        attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
      />
      {empresas.map((empresa, index) => (
        <Marker key={index} position={[empresa.latitude, empresa.longitude]}>
          <Popup>
            <text>Razão social: {empresa.razao}</text> <br />
            <br />
            <text>Nome fantasia: {empresa.nome}</text> <br />
            <br />
            <text>CNPJ: {empresa.cnpj}</text> <br />
            <br />
            <text>E-mail: {empresa.razao}</text> <br />
            <br />
          </Popup>
        </Marker>
      ))}
    </MapContainer>
  );
};
