all:

clean:

pdf:
	pdflatex -synctex=1 -interaction=nonstopmode -shell-escape --output-directory=build tex/DV017A_lab4.tex

clean:
