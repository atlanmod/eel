function drawAndPrint (file)
	hf = figure();
	data = dlmread(file);
	data(:,1) = data(:,1) ./ 1000000;
	plot(data(:,1), data(:,2));
	hold on;
	ylabel("current (mA)");
	xlabel("time (s)");
	print(hf, "plot.pdf");
	print(hf, "plot_tex.pdf", "-dpdflatexstandalone");
endfunction
