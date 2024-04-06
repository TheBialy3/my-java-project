package enemies;

import managers.EnemyManager;
import managers.TowerManager;
import managers.WaveManager;
import objects.PathPoint;

import java.util.ArrayList;

import static helpz.Constants.EnemyType.ROCK;

public class Rock extends Enemy{
    public Rock(float x, float y, int ID, int enemyType, ArrayList<PathPoint> wayForEnemies, EnemyManager enemyManager, WaveManager waveManager, TowerManager towerManager) {
        super(x, y, ID, enemyType, wayForEnemies, enemyManager, waveManager, towerManager);
    }

    public void heal(int heal) {
        this.healThis(heal);
    }

}
