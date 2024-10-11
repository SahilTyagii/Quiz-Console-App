package org.example;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "Which move can hit a Pokémon using Fly?", new String[]{"Thunder", "Earthquake", "Hyper Beam", "Solar Beam"}, 0);
        questions[1] = new Question(2, "What is the effect of the move 'Splash'?", new String[]{"Deals damage", "Heals the user", "No effect", "Increases speed"}, 2);
        questions[2] = new Question(3, "Which item increases a Pokémon's critical hit ratio?", new String[]{"Focus Sash", "Scope Lens", "Leftovers", "Quick Claw"}, 1);
        questions[3] = new Question(4, "What type is immune to Ground-type moves?", new String[]{"Flying", "Water", "Grass", "Electric"}, 0);
        questions[4] = new Question(5, "Which ability prevents a Pokémon from falling asleep?", new String[]{"Levitate", "Insomnia", "Sturdy", "Overgrow"}, 1);
    }

    public void displayQuestions() {
        for (Question q: questions) {
            System.out.println(q);
        }
    }

}
