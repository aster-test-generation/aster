import os
from thonny import get_workbench
from thonny.languages import tr

_OPTION_NAME = "run.pgzero_mode"

def test_toggle_variable():
    var = get_workbench().get_variable(_OPTION_NAME)
    toggle_variable()
    assert var.get() != var.get()
    update_environment()
    assert os.environ["PGZERO_MODE"] == str(get_workbench().get_option(_OPTION_NAME))

def test_update_environment():
    if get_workbench().in_simple_mode():
        os.environ["PGZERO_MODE"] = "auto"
    else:
        os.environ["PGZERO_MODE"] = str(get_workbench().get_option(_OPTION_NAME))
    update_environment()
    assert os.environ["PGZERO_MODE"] == str(get_workbench().get_option(_OPTION_NAME))

if __name__ == '__main__':
    unittest.main()