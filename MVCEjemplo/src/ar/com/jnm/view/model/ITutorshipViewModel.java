package ar.com.jnm.view.model;

public interface ITutorshipViewModel {

  IPersonViewModel getTutorViewModel();

  IPersonViewModel getStudentViewModel();

  void setTutorViewModel(IPersonViewModel tutorViewModel);

  void setStudentViewModel(IPersonViewModel studentViewModel);
}
