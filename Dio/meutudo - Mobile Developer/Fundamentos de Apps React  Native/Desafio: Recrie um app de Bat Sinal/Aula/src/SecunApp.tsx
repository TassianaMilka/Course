import React from 'react';
import { View, Text, TextInput, Button, StyleSheet, Image, ScrollView } from 'react-native';

export default function App() {
  return (
    <ScrollView contentContainerStyle={styles.container}>
      <Image
        source={require('./assets/bat-logo.png')}
        style={styles.logo}
      />
      <TextInput style={styles.input} placeholder="Text" />
      <Text style={styles.label}>Label</Text>
      <TextInput style={styles.input} placeholder="Text" />
      <Text style={styles.hint}>This is your hint</Text>
      <TextInput
        style={styles.textArea}
        placeholder="Your text here..."
        multiline
        numberOfLines={4}
      />
      <Text style={styles.label}>Label</Text>
      <TextInput
        style={styles.textArea}
        placeholder="Your text here..."
        multiline
        numberOfLines={4}
      />
      <Text style={styles.hint}>This is your hint</Text>
      <View style={styles.button}>
        <Button title="Enviar" color="#ffffffff" onPress={() => alert('Thank you!')} />
      </View>
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  container: {
    padding: 20,
    backgroundColor: '#fff',
    alignItems: 'stretch',
  },
  logo: {
    width: 100,
    height: 100,
    alignSelf: 'center',
    marginBottom: 30,
  },
  label: {
    fontWeight: 'bold',
    marginTop: 20,
    marginBottom: 5,
  },
  input: {
    borderWidth: 1,
    borderColor: '#ccc',
    padding: 10,
    borderRadius: 6,
  },
  hint: {
    fontSize: 12,
    color: '#888888ff',
    marginBottom: 10,
    marginTop: 4,
  },
  textArea: {
    borderWidth: 1,
    borderColor: '#dbd6d6ff',
    padding: 10,
    borderRadius: 6,
    textAlignVertical: 'top',
    marginBottom: 10,
  },
  button: {
    backgroundColor: '#000000ff',
    borderRadius: 8,
    marginTop: 30,
    paddingVertical: 10,
  },
});