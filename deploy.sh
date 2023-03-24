#!/bin/sh

git config --global http.postBuffer 157286400

mvn deploy -Prelease-composite

