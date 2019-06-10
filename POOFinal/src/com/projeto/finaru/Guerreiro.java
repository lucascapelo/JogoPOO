package com.projeto.finaru;





public class Guerreiro extends Heroi{
	public Guerreiro() {
		this.SetVida(50);
		this.SetMana(50);
		this.SetForca(10);
		
	}
	
	
	
	@Override
	public void levelUp() {
		this.SetNivel(this.GetNivel()+1);
		this.SetVida(this.GetVida()+Randomico.getRandomNumber(50,54));
		this.SetMana(this.GetMana()+Randomico.getRandomNumber(2,4));
	}

	@Override
	public void atacar(Monstro monstro) {
		// TODO Auto-generated method stub
		
		int critico = Randomico.getRandomNumber(0, 100);
		
		if(critico <= this.GetSorte()) {
			monstro.perderVida(this.GetForca()*2);
		}
		else {
			
			monstro.perderVida(this.GetForca());	
		}
	}

	@Override
	public void perderVida(int dano) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fugir(int nivel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void usarItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lancarFeitico(Feitico feitico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverFrente() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverTras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverDireita() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverEsquerda() {
		// TODO Auto-generated method stub
		
	}

}
