import unittest
from ansible.plugins.inventory.generator import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_template_method(self):
        inventory_module = InventoryModule()
        pattern = "{{ operation }}_{{ application }}_{{ environment }}_runner"
        variables = {
            "operation": "build",
            "application": "web",
            "environment": "dev"
        }
        result = inventory_module.templar(pattern, variables)
        expected = "build_web_dev_runner"
        self.assertEqual(result, expected)

    def test_add_parents_method(self):
        inventory_module = InventoryModule()
        inventory = InventoryModule()
        child = "host1"
        parents = [
            {
                "name": "{{ operation }}_{{ application }}_{{ environment }}",
                "parents": [
                    {
                        "name": "{{ operation }}_{{ application }}",
                        "parents": [
                            {
                                "name": "{{ operation }}"
                            },
                            {
                                "name": "{{ application }}"
                            }
                        ]
                    },
                    {
                        "name": "{{ application }}_{{ environment }}",
                        "parents": [
                            {
                                "name": "{{ application }}",
                                "vars": {
                                    "application": "{{ application }}"
                                }
                            },
                            {
                                "name": "{{ environment }}",
                                "vars": {
                                    "environment": "{{ environment }}"
                                }
                            }
                        ]
                    }
                ]
            },
            {
                "name": "runner"
            }
        ]
        template_vars = {
            "operation": "build",
            "application": "web",
            "environment": "dev"
        }
        inventory_module.add_parents(inventory, child, parents, template_vars)
        expected_groups = [
            "build_web_dev",
            "build_web",
            "build",
            "web_dev",
            "web",
            "dev",
            "runner"
        ]
        for group in expected_groups:
            self.assertIn(group, inventory.groups)

    def test_parse_method(self):
        inventory_module = InventoryModule()
        inventory = InventoryModule()
        path = "path/to/config/file"
        config = {
            "hosts": {
                "name": "{{ operation }}_{{ application }}_{{ environment }}_runner",
                "parents": [
                    {
                        "name": "{{ operation }}_{{ application }}_{{ environment }}",
                        "parents": [
                            {
                                "name": "{{ operation }}_{{ application }}",
                                "parents": [
                                    {
                                        "name": "{{ operation }}"
                                    },
                                    {
                                        "name": "{{ application }}"
                                    }
                                ]
                            },
                            {
                                "name": "{{ application }}_{{ environment }}",
                                "parents": [
                                    {
                                        "name": "{{ application }}",
                                        "vars": {
                                            "application": "{{ application }}"
                                        }
                                    },
                                    {
                                        "name": "{{ environment }}",
                                        "vars": {
                                            "environment": "{{ environment }}"
                                        }
                                    }
                                ]
                            }
                        ]
                    },
                    {
                        "name": "runner"
                    }
                ]
            },
            "layers": {
                "operation": ["build", "launch"],
                "environment": ["dev", "test", "prod"],
                "application": ["web", "api"]
            }
        }
        inventory_module.parse(inventory, None, path)
        expected_hosts = [
            "build_web_dev_runner",
            "build_web_test_runner",
            "build_web_prod_runner",
            "build_api_dev_runner",
            "build_api_test_runner",
            "build_api_prod_runner",
            "launch_web_dev_runner",
            "launch_web_test_runner",
            "launch_web_prod_runner",
            "launch_api_dev_runner",
            "launch_api_test_runner",
            "launch_api_prod_runner"
        ]
        for host in expected_hosts:
            self.assertIn(host, inventory.hosts)
        expected_groups = [
            "build_web_dev",
            "build_web",
            "build",
            "web_dev",
            "web",
            "dev",
            "build_api_dev",
            "build_api",
            "api_dev",
            "api",
            "test",
            "prod",
            "runner"
        ]
        for group in expected_groups:
            self.assertIn(group, inventory.groups)

if __name__ == '__main__':
    unittest.main()