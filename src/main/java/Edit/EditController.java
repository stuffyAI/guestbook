package Edit;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

public class EditController {
    @GetMapping(path = "/edit/{entry}")
    String editEntry(Model model, @ModelAttribute(binding = false) EditForm form, @PathVariable String entry) {

        model.addAttribute("entry", entry);
        model.addAttribute("form", form);

        return "edit";
    }
}
