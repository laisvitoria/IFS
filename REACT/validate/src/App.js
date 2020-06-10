import React, { Component } from 'react';
//import Validate from '.\node_modules\Validate.js\validate.js';
import './App.css';

class App extends Component {
  render() {
    return (
      <div>
        <form>
          <Nome />
          <Email />
          <Password />
          <input type="submit" value="Validar" />
        </form>
      </div>
    );
  }
}

class Nome extends React.Component {
  constructor(props) {
    super(props);
    this.state = {name: ''};

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({name: event.target.name});
  }

  handleSubmit(event) {
    event.preventDefault();
  }

  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <label>
          <h3>Nome (Requerido):</h3>
          <input type="text" name={this.state.name} onChange={this.handleChange} />
        </label>
      </form>
    );
  }
}

class Email extends React.Component {
  constructor(props) {
    super(props);
    this.state = {email: ''};

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({email: event.target.email});
  }

  handleSubmit(event) {
    event.preventDefault();
  }

  // Validar
  constraints = {
    email: {
      email: {
        message: "doesn't look like a valid email"
      }
    }
  };

  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <label>
          <h3>Email:</h3>
          <input type="text" email={this.state.email} onChange={this.handleChange} />
        </label>
      </form>
    );
  }
}

class Password extends React.Component {
  constructor(props) {
    super(props);
    this.state = {password: ''};

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({password: event.target.password});
  }

  handleSubmit(event) {
    event.preventDefault();
  }

  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <label>
          <h3>Password:</h3>
          <input type="text" password={this.state.password} onChange={this.handleChange} />
        </label>
      </form>
    );
  }
}

export default App;
