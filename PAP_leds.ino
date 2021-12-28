int led_verde_0 = 2; //atribui o pino 2 a variavel led
int led_vermelho_0 = 3; //atribui o pino 3 a variavel led

int led_verde_1 = 5;
int led_vermelho_1 = 6;

int led_verde_2 = 7;
int led_vermelho_2 = 8;

int led_verde_3 = 9;
int led_vermelho_3 = 10;

int led_verde_4 = 11;
int led_vermelho_4 = 12;


void setup()
{  
  Serial.begin(9600);
  pinMode(led_verde_0, OUTPUT);
  pinMode(led_vermelho_0, OUTPUT);

  pinMode(led_verde_1, OUTPUT);
  pinMode(led_vermelho_1, OUTPUT);

  pinMode(led_verde_2, OUTPUT);
  pinMode(led_vermelho_2, OUTPUT);

  pinMode(led_verde_3, OUTPUT);
  pinMode(led_vermelho_3, OUTPUT);

  pinMode(led_verde_4, OUTPUT);
  pinMode(led_vermelho_4, OUTPUT);

  digitalWrite (led_verde_0, HIGH);
  digitalWrite (led_verde_1, HIGH);
  digitalWrite (led_verde_2, HIGH);
  digitalWrite (led_verde_3, HIGH);
  digitalWrite (led_verde_4, HIGH);
  digitalWrite (led_vermelho_0, LOW);
  digitalWrite (led_vermelho_1, LOW);
  digitalWrite (led_vermelho_2, LOW);
  digitalWrite (led_vermelho_3, LOW);
  digitalWrite (led_vermelho_4, LOW);
  
}

void loop(){

  char serial = Serial.read();

  if(serial == '1'){

  if(digitalRead(led_verde_0)){
    digitalWrite (led_vermelho_0, HIGH);
    digitalWrite (led_verde_0, LOW);
  }

  else if(digitalRead(led_verde_1)){
    digitalWrite (led_vermelho_1, HIGH);
    digitalWrite (led_verde_1, LOW);
  }

  else if(digitalRead(led_verde_2)){
    digitalWrite (led_vermelho_2, HIGH);
    digitalWrite (led_verde_2, LOW);
  }

  else if(digitalRead(led_verde_3)){
    digitalWrite (led_vermelho_3, HIGH);
    digitalWrite (led_verde_3, LOW);
  }

  else if(digitalRead(led_verde_4)){
    digitalWrite (led_vermelho_4, HIGH);
    digitalWrite (led_verde_4, LOW);
  }

  }else if(serial == '0'){

    if(digitalRead(led_vermelho_4)){
      digitalWrite (led_vermelho_4, LOW);
      digitalWrite (led_verde_4, HIGH);
    }
    
    else if(digitalRead(led_vermelho_3)){
      digitalWrite (led_vermelho_3, LOW);
      digitalWrite (led_verde_3, HIGH);
    }
    
    else if(digitalRead(led_vermelho_2)){
      digitalWrite (led_vermelho_2, LOW);
      digitalWrite (led_verde_2, HIGH);
    }
    
    else if(digitalRead(led_vermelho_1)){
      digitalWrite (led_vermelho_1, LOW);
      digitalWrite (led_verde_1, HIGH);
    }
    
    else  if(digitalRead(led_vermelho_0)){
      digitalWrite (led_vermelho_0, LOW);
      digitalWrite (led_verde_0, HIGH);
    }
  }
}
