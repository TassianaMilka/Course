
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import Home from './src/screens/Home/Home';
import { Button, Image } from 'react-native';
import BatSignal from './src/screens/BatSignal/BatSignal';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

const Stack = createNativeStackNavigator();

export default function App() {

  function HomeScreen({ navigation }) {
  return (
    <View style={styles.container}>
      <Image
        source={require('./assets/image-Exemplo.jpg')}
        style={styles.logo}
      />
       <Text style={styles.label}>Tassiana Milka</Text>
      <View style={styles.button}>
        <Button
          title="Github"
          color="#fff"
          onPress={() => navigation.navigate('https://github.com/TassianaMilka')}
        />
      </View>

    </View>
  );
}

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
  
  button: {
    backgroundColor: '#000000',
    paddingHorizontal: 20,
    paddingVertical: 10,
    borderRadius: 8,
  },
  text: {
    fontSize: 20,
    fontWeight: 'bold',
    alignItems: 'center',
  },
});