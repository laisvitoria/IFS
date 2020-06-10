import React from 'react';
import { ScrollView, Image, Text } from 'react-native';

export default class App extends React.Component {
  render() {
    TextoAleatorio = require('random-textblock');

    return (
      <ScrollView style={{padding: 60}}>
        <Text style={{fontSize:96}}>{TextoAleatorio.getTextBlock(options)}</Text>
      </ScrollView>
    );
  }

  
};
const options = {
  minWords: 50,
  maxWords: 50,
  minSentences: 1,
  maxSentences: 1
};
