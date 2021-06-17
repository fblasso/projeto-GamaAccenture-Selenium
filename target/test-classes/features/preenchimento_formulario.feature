# language: pt
# encoding: utf-8


Funcionalidade: Preencher formularios do site sampleapp.tricentis.com e enviar email

  Cenário: Validar mensagem de sucesso de envio de email
    Dado que o usuario esta no site "http://sampleapp.tricentis.com/101/app.php"
    Quando preenche o formulário da aba “Enter Vehicle Data” e pressiona next
    E Preenche o formulário da aba “Enter Insurant Data” e pressiona next
    E Preenche o formulário da aba “Enter Product Data” e pressiona next
    E Preenche o formulário da aba “Select Price Option” e pressiona next
    E Preenche o formulário da aba “Send Quote” e pressiona Send
    Então verifica a mensagem "Sending e-mail success!" na tela
