import React from 'react';
import Figure from './components/Figure';


/*
  Components
  Props

*/

class App extends React.Component {

  render() {
    return (

      <div>
        <h1 className="title">Geometrizando</h1>

        <Figure type="square" color="red"/>
        <Figure type="circle" color="blue"/>
        <Figure type="triangle" color="black"/>
        <Figure type="rectangle" color="green" />
        
      </div>
    )
  }
}

export default App;
