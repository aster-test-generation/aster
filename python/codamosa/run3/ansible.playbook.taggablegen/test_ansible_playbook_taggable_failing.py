# Automatically generated by Pynguin.
import ansible.playbook.taggable as module_0

def test_case_0():
    try:
        taggable_0 = module_0.Taggable()
        list_0 = [taggable_0, taggable_0, taggable_0]
        int_0 = -2444
        str_0 = '#'
        var_0 = taggable_0.evaluate_tags(list_0, int_0, str_0)
    except BaseException:
        pass