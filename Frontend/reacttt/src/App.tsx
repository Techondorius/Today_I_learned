import React from 'react';
// import logo from './logo.svg';
import './App.css';
// import Checkbox from '@mui/material';
import { ButtonGroup, Button, Checkbox } from '@mui/material';

function App() {
  const [checked, setChecked] = React.useState(false);

  const handleChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    setChecked(event.target.checked);
  };

  return (
    <div className="App">
      <div>
        <h1>asdf</h1>
        <Button variant="contained">Hello World</Button>
      </div>
      <div>
        <ButtonGroup variant="outlined" aria-label="outlined primary button group">
          <Button>One</Button>
          <Button>Two</Button>
          <Button>Three</Button>
        </ButtonGroup>
      </div>
      <div>
        <Checkbox
          checked={checked}
          onChange={handleChange}
          inputProps={{ 'aria-label': 'controlled' }}
        />
      </div>
    </div>
  );
}

export default App;
