ultimatelyData = double(zeros(20,54));
for s = 1:20
	clear x0, clear t0,clear x1,clear  x2,clear y,clear x,
	clear e,clear b,clear f; 
	x0 = Top20LanguagesbyPopulationL1L2S5(s,:);
	t0 = [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
		,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
	x1 = [0,0,0,0];
	x2 = [0,0,0,0];
	n =length(x0);
	for i = 1:n 
	x1(i)=sum(x0(1:i));
	end
	x2(1)=x1(1);
	for i=2:n
	x2(i)=sum(x1(i)*t0(i))+x1(1);
	end
	for k =2:n
	z(k)=-0.5*x2(k)-0.5*x2(k-1)
	end
	for i =1:n-1
	b(i,1)=z(i+1);
	y(i)=x0(i+1);
	end
	b(:,2)=1;
	y=y';
	format rat;e = inv(b'*b)
	f=e*b'*y
	a=f(1);
	u=f(2);
	for j=2:n+50
	x(j) = (1 - exp(a*t0(j)))*(x0(1) - u/a) 
			* exp(- a*sum(t0(1:j)))/t0(j);
	end
	x(1)=x0(1)
	for mm = 1:54
	ultimatelyData(s,mm) =x(mm);
end
end
xlswrite('L2',ultimatelyData)