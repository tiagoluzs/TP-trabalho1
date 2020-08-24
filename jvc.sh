#!/bin/bash

set -e

echo 'Compilando arquivos..'
javac ./src/main/java/br/pucrs/tp/*.java > compile.log
echo 'Arquivos .class gerados com sucesso'
