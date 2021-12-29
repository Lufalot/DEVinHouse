import React from "react";

const Search = ({ onChange }) => {
  return (
    <div>
      <input type="search" placeholder="Buscar" size="50" onChange={onChange} />
    </div>
  );
};

export default Search;
