import {StyleSheet} from 'react-native';

//Estilo sobre a cor de fundo da página,margin,borda e centralização.
const styles = StyleSheet.create({
  appContainer: {
    flex: 1,
    backgroundColor: '#333333',
    alignItems: 'center',
    justifyContent: 'center',
  },
  logoContainer:{
    flexDirection:'column',
    borderColor: '#ffffff',
    borderWidth:2,
    justifyContent:'center',
    alignSelf:'center',
    marginBottom:60,
    paddingTop:20,
    paddingBottom:10,
    backgroundColor:'#4D4D4D'
  },
  inputContainer:{
    width:'80%',
    flexDirection:'column',
    alignItems:'center',
  }
});

export default styles