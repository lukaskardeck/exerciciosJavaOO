# Exercício 05

Em um banco, para cadastrar uma conta bancária é necessário informar o número da conta, o nome
do titular da conta e o valor de depósito inicial que o titular depositou ao abrir a conta.
Este valor de depósito inicial é opcional, ou seja, se o titular não quiser depositar ao criar a conta,
o saldo inicial da conta será zero.

Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado.

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso.
O saldo só aumenta por meio de depósitos e só diminui por meio de saques. Para cada saque, o banco cobra uma taxa
de $ 5.00. Neste banco, a conta pode ficar com saldo negativo, ou seja, saques podem ser realizados mesmo que o valor ultrapasse seu saldo.

Crie um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor
de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação.
