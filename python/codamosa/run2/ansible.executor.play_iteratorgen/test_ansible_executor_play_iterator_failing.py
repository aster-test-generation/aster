# Automatically generated by Pynguin.
import ansible.executor.play_iterator as module_0

def test_case_0():
    try:
        str_0 = '6`$JMg4ok'
        host_state_0 = module_0.HostState(str_0)
        list_0 = [host_state_0, host_state_0, str_0]
        bytes_0 = None
        float_0 = 512.0
        bytes_1 = b'"\xa4\xff\xfa\x92\xdb\xdar\x9a'
        play_iterator_0 = module_0.PlayIterator(list_0, bytes_0, float_0, bytes_1, list_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '0LT~Eqr"fi,4`-l*p'
        host_state_0 = module_0.HostState(str_0)
        bool_0 = True
        str_1 = 'Z(bYL4'
        host_state_1 = module_0.HostState(str_1)
        var_0 = host_state_0.__eq__(host_state_1)
        host_state_2 = module_0.HostState(bool_0)
    except BaseException:
        pass