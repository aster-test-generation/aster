# Automatically generated by Pynguin.
import ansible.module_utils.facts.virtual.freebsd as module_0

def test_case_0():
    try:
        bytes_0 = b'd\x02:o!'
        free_b_s_d_virtual_0 = module_0.FreeBSDVirtual(bytes_0)
        var_0 = free_b_s_d_virtual_0.get_virtual_facts()
    except BaseException:
        pass