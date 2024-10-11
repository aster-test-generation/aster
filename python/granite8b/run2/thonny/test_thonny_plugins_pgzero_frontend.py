import os
from thonny import get_workbench
from thonny.languages import tr


class TestToggleVariable:
    def test_toggle_variable(self):
        var = get_workbench().get_variable("_OPTION_NAME")
        var.set(False)
        toggle_variable()
        assert var.get() == True
        toggle_variable()
        assert var.get() == False

class TestUpdateEnvironment:
    def test_update_environment_simple_mode(self):
        get_workbench().set_in_simple_mode(True)
        update_environment()
        assert os.environ["PGZERO_MODE"] == "auto"

    def test_update_environment_not_simple_mode(self):
        get_workbench().set_in_simple_mode(True)
        get_workbench().set_option(_OPTION_NAME, True)
        update_environment()
        assert os.environ["PGZERO_MODE"] == "True"
        get_workbench().set_option(_OPTION_NAME, False)
        update_environment()
        assert os.environ["PGZERO_MODE"] == "False"


if __name__ == '__main__':
    unittest.main()