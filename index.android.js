/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,Button,
  Alert,
  View
} from 'react-native';
import Foo from './foo.js';

const  onPress = () => {

  Foo.show();
        }

class nproj extends Component {

  render() {
    return (
      <Button
        onPress={onPress}
        title="Learn More"
        color="#841584"
        accessibilityLabel="Learn more about this purple button"
      />
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});

AppRegistry.registerComponent('nproj', () => nproj);
