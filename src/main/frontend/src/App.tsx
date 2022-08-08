import React, { useEffect, useState } from 'react'
import "./index.css";
import 'bulma/css/bulma.min.css';
import { Table } from "react-bulma-components";

const App = () => {

  const [usuarios, setUsuarios] = useState<any[]>([]);
  const [loading, setLoading] = useState(false);

  // API Call
  useEffect(() => {
    setLoading(true);

    fetch('api/usuarios')
      .then(response => response.json())
      .then(data => {
        setUsuarios(data);
        setLoading(false);
        console.log(data);
      });
  }, [])

  if (loading) {
    <h1>Loading...</h1>
  }


  return (
    <div className='container is-fluid my-3'>
      <Table size='fullwidth' striped={true} hoverable={true}>
        <thead>
          <tr>
            <th className=''>Nombre y Apellido</th>
            <th className=''>Email</th>
            <th className=''>Teléfono</th>
          </tr>
        </thead>
        <tbody>
          {usuarios.map(usuario =>
            <tr key={usuario.id} className=''>
              <td>{ usuario.nombre } { usuario.apellido }</td>
              <td>{ usuario.email }</td>
              <td>{ usuario.telefono }</td>
            </tr>
          )}
        </tbody>
      </Table>
    </div>
  )
}

export default App
