package ar.com.jnm.controller;

import ar.com.jnm.model.Person;
import ar.com.jnm.model.Tutorship;
import ar.com.jnm.view.ITutorshipListener;
import ar.com.jnm.view.model.IPersonViewModel;
import ar.com.jnm.view.model.ITutorshipViewModel;

public class AddTutorshipController implements ITutorshipListener {

  @Override
  public void actionPerformed(ITutorshipViewModel tutorshipViewModel) {
    Person tutor = buildPerson(tutorshipViewModel.getTutorViewModel());
    Person student = buildPerson(tutorshipViewModel.getStudentViewModel());
    Tutorship tutorship = new Tutorship(tutor, student);
    System.out.println("Se creo la tutoria: " + tutorship);
  }

  private Person buildPerson(IPersonViewModel personViewModel) {
    return new Person(personViewModel.getPersonName(), personViewModel.getAge());
  }

}
