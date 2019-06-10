package com.projeto.finaru;

public class Goblin extends Monstro{
	
	public Goblin() {
		this.SetVida(50);
	}
	
	@Override
	public void levelUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int atacar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void perderVida(int dano) {
		this.SetVida(this.GetVida()-dano);
		
	}

	@Override
	public void receberFeitico(Feitico feitico) {
		// TODO Auto-generated method stub
		
	}

}
