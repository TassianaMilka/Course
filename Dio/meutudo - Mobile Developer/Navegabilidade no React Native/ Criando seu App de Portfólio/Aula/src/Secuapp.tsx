
import React from 'react';
import { View, Text,StyleSheet, Image } from 'react-native';

export default function App() {
   return (

      <View style={styles.container}>
        <Image
          source={require('./assets/image-Exemplo.jpg')}
          style={styles.logo}
        />
         <Text style={styles.label}>Algumas Habilidades de Linguagem de Programação</Text>
         <Text className="linguagens" style={styles.text}>- Java </Text>
         <Text className="linguagens" style={styles.text}>- Ruby</Text>
         <Text className="linguagens" style={styles.text}>- Python</Text>

     <Button
          title="Página Inicial"
          color="#fff"
          onPress={() => navigation.navigate('App.tsx')}
        />
      </View>

    );
  
  }
  
  const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: '#ffffffff',
      alignItems: 'center',
      justifyContent: 'center',
    },
    logo: {
      width: 120,
      height: 120,
      marginBottom: 30,
    },
  
    text: {
      fontSize: 20,
      fontWeight: 'bold',
      alignItems: 'center',
    },

    linguagens:{

      fontSize: 18,
      marginTop: 10,
      fontWeight: 'bold',
    
    },

    button: {
    backgroundColor: '#000000',
    paddingHorizontal: 20,
    paddingVertical: 10,
    borderRadius: 8,
  },
  });

